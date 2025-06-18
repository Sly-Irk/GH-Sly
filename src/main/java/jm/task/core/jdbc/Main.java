package jm.task.core.jdbc;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        public static void main (String[]args){
            Util.getConnection();
            UserDao userDao = new UserDaoJDBCImpl();

            userDao.createUsersTable();

            userDao.saveUser("Ivan", "Ivanov", (byte) 31);
            userDao.saveUser("Petr", "Petrov", (byte) 27);
            userDao.saveUser("Lena", "Lenina", (byte) 22);
            userDao.saveUser("Katya", "Katina", (byte) 25);

            userDao.removeUserById(1);
            userDao.getAllUsers();
            userDao.cleanUsersTable();
            userDao.dropUsersTable();
        }
    }
}
