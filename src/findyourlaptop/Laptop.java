/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourlaptop;

/**
 *
 * @author kasudyy
 */
public class Laptop{
    public int sN;
    public String manufacturer;
    public String modelNumber;
    public String processor;
    public String screenSize;
    public String ram;
    public int storage;
    public int price;
    
    public Laptop(int sN, String manufacturer, String modelNumber, String processor,
                  String screenSize, String ram, int storage, int price)
    {
        this.sN = sN;
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.processor = processor;
        this.screenSize = screenSize;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    //acessor methods for each variable
    public int getSN(){
        return sN;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModelNumber(){
        return modelNumber;
    }
    public String getProcessor(){
        return processor;
    }
    public String getScreenSize(){
        return screenSize;
    }
    public String getRam(){
        return ram;
    }
    public int getStorage(){
        return storage;
    }
    public int getPrice(){
        return price;
    }
    
    public String[] getLaptop(){
        String serialNo_str = Integer.toString(sN);
        String storage_str = Integer.toString(storage)+ " GB";
        String price_str = Integer.toString(price);
        String product [] = {serialNo_str, manufacturer, modelNumber, processor, screenSize, ram, storage_str, price_str};
        return product;
    }
     
    public void displayModel()
    {
        System.out.println(sN + "model no is: " + modelNumber + " Price: "+ price);
    }
}
