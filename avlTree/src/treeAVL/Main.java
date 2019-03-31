package treeAVL;

import Excepciones.IsEmptyException;

public class Main {
    
    public static void main(String[] args) throws IsEmptyException {
        TreeAVL<Integer> tree = new TreeAVL<>(5);
        tree.agregar(5);
        tree.agregar(2);
        tree.agregar(19);
        tree.agregar(3);
        tree.agregar(10);
        tree.agregar(8);
        tree.agregar(4);
        tree.agregar(83);
        tree.agregar(8);
        tree.agregar(10);
        tree.agregar(7);
        tree.agregar(5);
        tree.agregar(11);
        tree.agregar(22);
        tree.agregar(23);
        tree.agregar(15);
        tree.agregar(8);
        tree.agregar(82);
        tree.agregar(10);
        tree.agregar(7);
        tree.agregar(5);
        tree.agregar(1);
        tree.agregar(22);
        tree.agregar(63);
        tree.agregar(65);
        tree.agregar(70);
        tree.agregar(43);
        tree.agregar(23);
        tree.agregar(12);
        tree.agregar(32);
        tree.agregar(342);
        tree.agregar(100);
        tree.agregar(34);
        tree.agregar(15);
        
        tree.borrar(15);
        tree.borrar(43);
        tree.borrar(5);
        tree.borrar(22);
        tree.borrar(63);
        tree.borrar(65);
        
        System.out.println("\nBetween: "+tree.beetwen(-1, 2_000));
        System.out.println("El mayor es: "+tree.bigger());
        System.out.println("El menor es: "+tree.minor());
        
        System.out.println(tree);
        tree.inOrder();
        tree.posOrder();
        tree.preOrder();
        
        int menor=tree.minor();
        System.out.println("Borrar el Menor "+tree.borrar(menor));
        System.out.println(tree);
        tree.inOrder();
        tree.posOrder();
        tree.preOrder();
        System.out.println("El menor es: "+tree.minor());
        System.exit(0);
    }
}
