public  class Mobile {


    public Mobile (String system, String brand, int model, int AndroidVersion, int storage){
this.system=system;
this.brand=brand;
this.model=model;
this.androidVersion=AndroidVersion;
this.storage=storage;
this.color=color;

    }


    private String system;
    private String brand;
    private int model;
    private int androidVersion;
    private int storage;
    public String color;

    public Mobile(String color){
        this.system=color;
    }

    public String whatPhoneAmIHave (){

        return brand+" "+model;
    }

    public String getColor (){
        return color;
    }
}


