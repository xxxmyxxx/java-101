public class BoxMain {
    public static void main(String[] args) {
        Fighter f1= new Fighter("Muhammed Ali",20,120,100,30);
        Fighter f2= new Fighter("Tarantula Necmi",25,100,85,50);

        Match match=new Match(f1,f2,85,100);
        match.run();
    }

}
