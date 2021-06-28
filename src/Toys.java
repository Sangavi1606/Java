import java.util.Scanner;

public abstract class Toys {
    public abstract void softToys();

    public abstract void machineryToys();

    public abstract void rubberToys();
}

class Girls extends Toys {
    Scanner sc = new Scanner(System.in);

    @Override
    public void softToys() {
        System.out.println("Enter how many girls like SoftToys:");
        int percentageCount = sc.nextInt();
        System.out.println(percentageCount);
    }

    @Override
    public void machineryToys() {
        System.out.println("Enter how many girls like MachineryToys:");
        int percentageCount = sc.nextInt();
        System.out.println(percentageCount);
    }

    @Override
    public void rubberToys() {
        System.out.println("Enter how many girls like RubberToys:");
        int percentageCount = sc.nextInt();
        System.out.println(percentageCount);
    }
}

class Boys extends Toys {
    Scanner sc = new Scanner(System.in);

    @Override
    public void softToys() {
        System.out.println("Enter how many boys like SoftToys:");
        int percentageCount = sc.nextInt();
        System.out.println(percentageCount);
    }

    @Override
    public void machineryToys() {
        System.out.println("Enter how many boys like MachineryToys:");
        int percentageCount = sc.nextInt();
        System.out.println(percentageCount);
    }

    @Override
    public void rubberToys() {
        System.out.println("Enter how many boys like RubberToys:");
        int percentageCount = sc.nextInt();
        System.out.println(percentageCount);
    }
}

class Abstraction {
    public static void main(String[] args) {
        Girls girls = new Girls();

        girls.softToys();
        girls.machineryToys();
        girls.rubberToys();


        Boys boys = new Boys();

        boys.softToys();
        boys.machineryToys();
        boys.rubberToys();

    }
}
