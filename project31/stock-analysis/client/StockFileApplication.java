package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {

    public static void main(String args[]) throws IOException{
        StockFileReader fr = new StockFileReader("table.csv");

        List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());

        StockFileData fileData = new StockFileData();
        fileData.addData(dataResult);
        fileData.printData();
        System.out.println(dataResult.size()); //Prints the elements of the list
    }


    /**
     * Complete the method body so that it returns the given structure needed to
     * populate the data field in the StockFileData class.
     * @param headers
     * @param lines
     * @return List
     */
    public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
        List<HashMap<String, Double>> dataResult = new ArrayList<>();
        // Insert your code here..
        //System.out.println(headers);
        //System.out.println(lines);

        ////I didn't attempt it////////
        //I could not imagine it/////////
        /////Teacher Solution///////////

        for(String line : lines) { //loop over the collection/list = lines
            String [] values = line.split(",");//split each line by a "," to return an array of strings

            HashMap<String, Double> headerValueMap = new HashMap <>();//this list will save the data below:
            int cnt = 0;//Index position
            for(String value : values) {//iterate over the values array
                double dval = Double.parseDouble(value);//cnvert value into a double
                headerValueMap.put(headers.get(cnt), dval);//populate the HashMap:headerValueMap
                cnt++;//counter ++
            }
            dataResult.add(headerValueMap);//Once the headerValueMap is ready, add it to the original
        }
        return dataResult;
    }


}
