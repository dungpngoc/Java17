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
                System.out.printf("- - - - - - - - - - - - - Welcome %s ?????n v???i th??? gi???i di ?????ng - - - - - - - - - - - - \n", user.getUsername());
                System.out.println("-------------------------Ch??c qu?? kh??ch n??m m???i ??n khang thinh v?????ng------------------------\n");
                return user;
            }
        }
        throw new NotFoundException("Email ho???c m???t kh???u kh??ng ch??nh x??c");
    }

    public User getUserByEmail(String email) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        throw new NotFoundException("Kh??ng t??m th???y Email");
    }

    public void updateInfo(String email, Address address) {
        userRepository.updateInfo(email,address);
    }

    public Address getAddress(String email) {
        Address address = new Address();
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                System.out.println("????n h??ng s??? ???????c g???i qua ?????a ch??? : " + "T???nh " + user.getAddress().getProvince()
                + ", ph?????ng " + user.getAddress().getDistrict() + ", ???????ng " + user.getAddress().getStreet() + ", s??? nh?? "
                + user.getAddress().getHouseNumber());
                System.out.println("C??m ??n b???n ???? tin t?????ng v?? s??? d???ng d???ch v??? c???a ch??ng t??i ... ");
                return address;
            }
        }
        throw new NotFoundException("Ch??a c?? th??ng tin ?????a ch??? c???a b???n, h??y c???p nh???p ?????a ch??? ...");
    }

    public void changePassword(String email, String newPassword) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                user.setPassword(newPassword);
            }
        }
        FileUtils.setDataToFile("user.json",UserDB.users);
        System.out.println("?????i m???t kh???u th??nh c??ng");
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
                System.out.println("Ch??ng t??i ???? g???i password ?????n email c???a b???n h??y m??? email v?? x??c nh???n");
                System.out.println("Password hi???n t???i c???a b???n l?? :");
                System.out.println(user.getPassword());
            }
        }
    }
}
