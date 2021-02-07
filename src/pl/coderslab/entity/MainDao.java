package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        //DODAWANIE
//        user.setUserName("arek");
//        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
//        user.setPassword("pass");
//        userDao.create(user);

        //ODCZYTYWANIE
//        User read = userDao.read(1);
//        System.out.println(read);
//        User readNotExist = userDao.read(7);
//        System.out.println(readNotExist);

        //MODYFIKOWANIE
//        User userToUpdate = userDao.read(1);
//        userToUpdate.setUserName("Arkadiusz");
//        userToUpdate.setEmail("arek@coderslab.pl");
//        userToUpdate.setPassword("superPassword");
//        userDao.update(userToUpdate);

        //WCZYTANIE WSZYSTKICH UŻYTKOWNIKÓW
        User secondUser = new User();
        secondUser.setUserName("marek");
        secondUser.setEmail("marek@coderslab.pl");
        secondUser.setPassword("pass");
        userDao.create(secondUser);
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }

        //USUWANIE
        userDao.delete(2);



    }

}
