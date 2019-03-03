public class Transport {

    public interface Transports {

        void capacity(); // вместимость

        void move(); // движение

        void permeability(); // проходимость

    }

    public abstract class Cars implements Transports {

        public abstract void capacity() ;
        @Override
        public void move(){
            System.out.println("Трррртр тррр");
        }
        @Override
        public void permeability(){
            System.out.println("Где есть дорожка там и проедет");
        }
        public abstract void wheels();

    }
    public abstract class Passenger_car extends Cars{
        @Override
        public void capacity(){
            System.out.println("Приблизительно 4 чела и немного вещичек");
        }
        @Override
        public void wheels(){
            System.out.println("на чеетырех колесиках");
        }
        public abstract void fuel();
    }
    public class Diesel extends Passenger_car{
        @Override
        public void fuel(){
            System.out.println("Дизель");
        }
    }
    public  class Gasoline extends Passenger_car{
        @Override
        public void fuel(){
            System.out.println("Бензин");
        }
    }

   public class Lorry extends Cars{
        @Override
       public void capacity(){
            System.out.println("хз сколько челов но вещей можно много забрать");
        }
       @Override
       public void wheels(){
           System.out.println("на чеетырех и может быть более колесиках ");
       }
   }

   public class Motorcycle extends Cars{
        @Override
       public void capacity(){
            System.out.println("1 - 2 челика");
        }
        @Override
        public void wheels(){
            System.out.println("два колеса ");
        }
   }

    public abstract class For_one implements Transports{
        @Override
        public void capacity(){
            System.out.println("1 челик ");
        }
        @Override
        public void move(){
            System.out.println("Вжжжжж жввж жж");
        }
        @Override
        public void permeability() {
            System.out.println("Только по дорожкам в городе редко за городом");
        }

        public abstract void fuel();

    }

    public class Self_balancing_scooter extends For_one{
        @Override
        public void fuel(){
            System.out.println("Электричество");
        }
    }
    public class Bike extends For_one{
        @Override
        public void fuel(){
            System.out.println("Мышцы ног :)");
        }
    }

    public class railway_transport implements Transports{
        @Override
        public void capacity(){
            System.out.println("много и груза и челиков");
        }
        @Override
        public void move(){
            System.out.println("Чух чух");
        }
        @Override
        public void permeability() {
            System.out.println("Только по железной дороге");
        }
    }
}