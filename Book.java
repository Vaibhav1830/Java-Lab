import java.util.Scanner  ;

class Main{
    public static void main(String args[]){
        int n ;
        System.out.print("Enter the number of books:") ;
        Scanner sc  = new Scanner(System.in) ; n = sc.nextInt() ;
        sc.nextLine() ;
        Book books[] = new Book[n];
        for(int i = 0 ; i<n ; i++){
            System.out.print("Enter the book name: ") ;
            String name = sc.nextLine() ;

            System.out.print("Enter the author name: ") ;
            String author = sc.nextLine()  ;
            System.out.print("Enter the price of the book: ") ;
            int price = sc.nextInt() ;
            System.out.print("Enter the number of pages in the book: ") ;
            int numPages = sc.nextInt() ;
            sc.nextLine() ;

            books[i] = new Book(name,author,price,numPages) ;
        }

        System.out.println("");
        for(int i = 0 ; i<n ; i++){
            System.out.println(books[i].toString()) ;
        }
        System.out.println("Vaibhav Dhar" )  ;
        System.out.print("1BM23CD068") ;
        sc.close();
    }
}


class Book{
    String name , author  ;
    int price , numPages ;

    Book(String name , String author , int price , int numPages){
        this.name = name ;
        this.author = author ;
        this.price = price ;
        this.numPages = numPages ;
    }

    public String toString(){
        String name  ,author  , price,numPages ;
        name = "Book name: " + this.name + "\n" ;
        author = "Author name: " + this.author + "\n" ;
        price = "Price: " + this.price + "\n" ;
        numPages = "Number of pages: " + this.numPages + "\n" ;
        return name + author + price + numPages ;
    }
}

