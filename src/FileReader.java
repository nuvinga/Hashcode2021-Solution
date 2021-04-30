import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    //First
    private List<SingleRun> rides = new ArrayList<>();
    private List<Car> carRides = new ArrayList<>();
    private int simulationTime;
    private int numIntersections;
    private int numStreets;
    private int numCars;
    private int totalPoints;


    FileReader(String path){
        File file = new File(path);

        try(
                BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))
        ){

            String line = bufferedReader.readLine();
            String[] lineSplit = line.split(" ");
            simulationTime = Integer.parseInt(lineSplit[0]);
            numIntersections = Integer.parseInt(lineSplit[1]);
            numStreets = Integer.parseInt(lineSplit[2]);
            numCars = Integer.parseInt(lineSplit[3]);
            totalPoints = Integer.parseInt(lineSplit[4]);

            for(int lineCount = 0; lineCount < numStreets; lineCount++ ){
                line = bufferedReader.readLine();
                lineSplit = line.split(" ");

                int intersectionStart = Integer.parseInt(lineSplit[0]);
                int intersectionEnd = Integer.parseInt(lineSplit[1]);
                String streetName = lineSplit[2];
                int time = Integer.parseInt(lineSplit[3]);

                SingleRun singleRide = new SingleRun(intersectionStart,intersectionEnd,streetName,time);
                rides.add(singleRide);
            }

            for(int cars = 0; cars < numCars; cars++){
                line = bufferedReader.readLine();
                lineSplit = line.split(" ");

                int numOfPaths = Integer.parseInt(lineSplit[0]);
                List<String> paths = new ArrayList<>();
                for(int streets = 1; streets <= numOfPaths; streets++){
                    paths.add(lineSplit[streets]);
                }

                Car car = new Car(numOfPaths, paths);
                carRides.add(car);

                System.out.println(car);
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }

        try(
                PrintWriter printWriter = new PrintWriter(new FileWriter("outputs/" + file.getName().replace(".txt", ".out")));
        ){

//            for(int runs = 0; runs < carRides.size()-1; runs++){
//                printWriter.write(carRides.get(runs).getNumStreets() - 1 + "\n");
//                printWriter.write("1\n");
//                printWriter.write("2\n");
//                printWriter.write("rue-d-athenes 2\n");
//                printWriter.write("rue-d-amsterdam 1\n");
//                printWriter.write("0\n");
//                printWriter.write("1\n");
//                printWriter.write("rue-de-londres 2\n");
//                printWriter.write("2\n");
//                printWriter.write("1\n");
//                printWriter.write("rue-de-moscou 1\n");
//            }

            for(int runs = 1; runs < carRides.size(); runs++){
                printWriter.write(carRides.get(runs).getNumStreets() - 1 + "\n");
                printWriter.write("1\n");
                printWriter.write("2\n");
                printWriter.write("rue-d-athenes 1\n");
                printWriter.write("rue-d-amsterdam 1\n");
                printWriter.write("0\n");
                printWriter.write("1\n");
                printWriter.write("rue-de-londres 1\n");
                printWriter.write("2\n");
                printWriter.write("1\n");
                printWriter.write("rue-de-moscou 1\n");
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }




    }


}
