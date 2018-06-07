public class Container{
    String liquid;

    public String getLiquid(){
        return liquid;
    }

    public void setLiquid(String liq){
        this.liquid = liq
    }
}

Container c = new Container();
Container m = new Container();

c.setLiquid("Water");
m.setLiquid("Milk");

String liqd = c.getLiquid();
System.out.println(liqd);
System.out.println(m.getLiquid());