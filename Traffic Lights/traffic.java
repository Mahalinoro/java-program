import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



class traffic {

    
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        int LimitCarNumber = 100;        
        int reached_max = 0;       
 
        
        while(reached_max == 0){
            System.out.println("------------------------------------");
            System.out.println("        RED LIGHT: 20 SECONDS       ");
            System.out.println("------------------------------------");
                Red(cars, LimitCarNumber);

            if (cars.size() == 100){
                reached_max = 1;

                while(reached_max == 1){
                    System.out.println("------------------------------------");
                    System.out.println("      YELLOW LIGHT: 10 SECONDS      ");
                    System.out.println("------------------------------------");
                        Yellow(cars);
                        
            
                    System.out.println("------------------------------------");
                    System.out.println("      GREEN LIGHT: 30 SECONDS       ");
                    System.out.println("------------------------------------");
                        Green(cars);
                }
            }
            
        else{
            System.out.println("------------------------------------");
            System.out.println("      YELLOW LIGHT: 10 SECONDS      ");
            System.out.println("------------------------------------");
                Yellow(cars);
            

            System.out.println("------------------------------------");
            System.out.println("      GREEN LIGHT: 30 SECONDS       ");
            System.out.println("------------------------------------");
                Green(cars);
           

            
                }
            }
        }                                       
                                
                 
    public static void Red(ArrayList <Integer> array, int LimitCarNumber) throws InterruptedException{
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
          int carNumber = 5; 
          Random rand = new Random();    
            
                for (int carItem = 0; carItem < carNumber; carItem++){                  
                        array.add(rand.nextInt(1001));                      
                        System.out.println("The number of car on the road is now: " + array.size());
                                    
                    if(array.size() == LimitCarNumber){
                        break;
                    }    
                                   
                }
          
        };
        
        scheduledExecutorService.scheduleAtFixedRate(task, 0,2, TimeUnit.SECONDS);
        
     
        scheduledExecutorService.awaitTermination(20, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }


    
    public static void Yellow(ArrayList <Integer> array) throws InterruptedException{
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
        int carNumber = 1;           
                
                for (int carItem = 0; carItem < carNumber; carItem++){                    
                        array.remove(carItem);                      
                        System.out.println("The number of car on the road is now: " + array.size());
                                       
                    if(array.size() == 0){
                        System.exit(0);
                        System.out.println("------------------------------------");
                        System.out.println("        The road is now empty       ");
                        System.out.println("------------------------------------");
                    }    
                }          
            };
        scheduledExecutorService.scheduleAtFixedRate(task, 1,1, TimeUnit.SECONDS);
        
     
        scheduledExecutorService.awaitTermination(10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }



    public static void Green(ArrayList <Integer> array) throws InterruptedException{
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
        int carNumber = 1;           
                
                for (int carItem = 0; carItem < carNumber; carItem++){                    
                        array.remove(carItem);                      
                        System.out.println("The number of car on the road is now: " + array.size());
                                       
                    if(array.size() == 0){
                        System.exit(0);
                        System.out.println("------------------------------------");
                        System.out.println("        The road is now empty       ");
                        System.out.println("------------------------------------");
                    }    
                }          
            };
        scheduledExecutorService.scheduleAtFixedRate(task, 1,1, TimeUnit.SECONDS);
        
     
        scheduledExecutorService.awaitTermination(30, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
        }
}

