package TGDDproduct_management.backend.service;
import TGDDproduct_management.backend.database.UserDB;
import TGDDproduct_management.backend.exception.NotFoundException;
import TGDDproduct_management.backend.model.Address;
import TGDDproduct_management.backend.model.User;
import TGDDproduct_management.backend.repository.UserRepository;
import TGDDproduct_management.backend.request.UserRegister;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;
import java.util.regex.Pattern;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public List<User> getUser() {
        return userRepository.findAllUser();
    }


    public User userRegister(UserRegister register) {
        User user = new User();
        user.setUsername(register.getUsername());
        user.setPassword(register.getPassword());
        user.setEmail(register.getEmail());
        user.setPhoneNumber(register.getPhoneNumber());

        userRepository.saveUser(user);
        return user;
    }

    public boolean checkEmailDB(String email) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }



    public boolean checkEmail(String email) {
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return patternMatches(email,regexPattern);
    }


    public static boolean patternMatches(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }

    public boolean checkPassword(String password) {
        if (7 <= password.length() && password.length() <= 15) {
            return true;
        }
        return false;
    }
    public boolean checkPhoneNumber(String phoneNumber) {
        String regexPattern = "^0\\d{9,10}$";
        return patternMatchesPhone(phoneNumber,regexPattern);
    }


    public static boolean patternMatchesPhone(String phoneNumber, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(phoneNumber)
                .matches();
    }

    public User checkLogin(String email, String password) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.printf("Welcome %s đến với thế giới di động", user.getUsername());
                System.out.println();
                return user;
            }
        }
        throw new NotFoundException("Email hoặc mật khẩu không chính xác");
    }

    public User getUserByEmail(String email) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        throw new NotFoundException("Không tìm thấy Email");
    }

    public void updateInfo(String email, Address address) {
        userRepository.updateInfo(email,address);
    }

    public Address getAddress(String email) {
        Address address = new Address();
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                System.out.println("Đơn hàng sẽ được gửi qua địa chỉ : " + "Tỉnh " + user.getAddress().getProvince()
                + ", phường " + user.getAddress().getDistrict() + ", đường " + user.getAddress().getStreet() + ", số nhà "
                + user.getAddress().getHouseNumber());
                System.out.println("Cám ơn bạn đã tin tưởng và sử dụng dịch vụ của chúng tôi ... ");
                return address;
            }
        }
        throw new NotFoundException("Chưa có thông tin địa chỉ của bạn, hãy cập nhập địa chỉ ...");
    }

    public void changePassword(String email, String newPassword) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                user.setPassword(newPassword);
            }
        }
        FileUtils.setDataToFile("user.json",UserDB.users);
        System.out.println("Đổi mật khẩu thành công");
    }

    public boolean checkCurrentPassword(String email, String currentPassword) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                if (user.getPassword().equals(currentPassword)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void findPasswordByEmail(String email) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                System.out.println("Chúng tôi đã gửi password đến email của bạn hãy mở email và xác nhận");
                System.out.println("Password hiện tại của bạn là :");
                System.out.println(user.getPassword());
            }
        }
    }
}
