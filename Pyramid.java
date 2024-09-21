/*
Write a program that estimates how much Kufu’s pyramid in Giza weighs.
  a. Your program should assume that every block weighs 2.5 tons. Kufu’s pyramid in Giza used around 2,500,000 blocks.
  b. You should use two variables, numBlocks and blockWeight, to calculate the weight.
  c. Display three lines of text using the variables, each saying in a sentence: 
      - The number of blocks in Kufu’s pyramid.
      - The weight of each block. 
      - The total weight of the pyramid. 
Here is an example output for a pyramid that uses 150,000 blocks:
    Kufu’s pyramid has 150,000.0 blocks.
    Each block weighs 2.5 tons.
    The pyramid weighs 375000.0 tons.
*/

public class Pyramid 
{
    public static void main(String[] args)
    {
        double numBlocks = 2500000;
        double blockWeight = 2.5;
        System.out.println("The number of blocks in Kufu's pyramid is " + numBlocks + "blocks.");
        System.out.println("The weight of each block is " + blockWeight + "tons.");
        System.out.print("The total weight of the pyramid is " + blockWeight*numBlocks + "tons.");



    }
}
