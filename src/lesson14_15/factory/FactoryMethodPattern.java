package lesson14_15.factory;

interface Handler{
    void read();
    void write();
}
class XmlHandler implements Handler{
    @Override
    public void read(){
        // read from xml
    }
    @Override
    public void write(){
        // do smth
    }
}
class JsonHandler implements Handler{
    @Override
    public void read(){
        // read from xml
    }
    @Override
    public void write(){
        // do smth
    }
}

class FactorPattern {
    public Handler getChild(String str){
        if(str.equals("A")){
            return new JsonHandler();
        } else {
            return new XmlHandler();
        }
    }

    public void someVoid(){
        FactorPattern factorPattern = new FactorPattern();
        Handler handler = factorPattern.getChild("config.json");
        handler.read();
        handler.write();
    }
}



