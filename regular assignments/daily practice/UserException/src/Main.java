class IllegalAgeException extends Exception{
    IllegalAgeException(String msg){
        System.out.println(msg);
    }
}

class Main{
    public static void vote( int a) throws IllegalAgeException {
        if(a<18){
            throw new IllegalAgeException("Not Eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String args[]){
        try{
            vote(15);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}