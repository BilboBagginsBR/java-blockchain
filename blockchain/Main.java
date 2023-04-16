package blockchain;

import java.util.Scanner;

import blockchain.logic.Block;
import blockchain.logic.BlockManager;

public class Main {

    private static final String FILE = "blockchain.obj";

    public static void main(String[] args) {

        Block block = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many zeros the hash must start with: ");

        BlockManager manager = new BlockManager(scanner.nextInt(), block);

        Block b1 = manager.createBlock();
        Block b2 = manager.createBlock();
        Block b3 = manager.createBlock();
        Block b4 = manager.createBlock();
        Block b5 = manager.createBlock();

    }
}