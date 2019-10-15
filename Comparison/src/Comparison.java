public class Comparison{
    public static void main(String[] args){
        Integer petyAge = 33;
        Integer vasyAge = 38;
        Integer kolyAge = 32;

        Integer youngest = 0;
        Integer middle = 0;
        Integer oldest = 0;

    if (petyAge > vasyAge){
            if(kolyAge > petyAge){
                youngest = vasyAge;
                middle = petyAge;
                oldest = kolyAge;
            }else if(kolyAge > vasyAge){
                youngest = vasyAge;
                middle = kolyAge;
                oldest = petyAge;
            }else {
                youngest = kolyAge;
                middle = vasyAge;
                oldest = petyAge;
            }
    }else if ((kolyAge <= vasyAge)&&(kolyAge > petyAge)){
        youngest = petyAge;
        middle = kolyAge;
        oldest = vasyAge;
    }else if(kolyAge <= vasyAge) {
        youngest = kolyAge;
        middle = petyAge;
        oldest = vasyAge;
    }else {
        youngest = petyAge;
        middle = vasyAge;
        oldest = kolyAge;
    }
    System.out.println("youngest: " + youngest);
    System.out.println("middle: " + middle);
    System.out.println("oldest: " + oldest);
    }
}
