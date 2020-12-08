public class BeerSong {
    public static void main(String[] args) {
      int beerNum = 2;
      String word = "bottles";

      while (beerNum > 0) {

        if (beerNum == 1) {
          word = "bottle";    
        }

        // 调试
        System.out.println(word);  // 语句一

        System.out.println(beerNum + " " + word + " of beer on the wall");  // 语句二
        // 当 beernum == 1 时，此句输出的 word 未如期变为 bottle

        // 调试
        System.out.println(word);

        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around. ");

        beerNum = beerNum - 1;

        if (beerNum > 0) {
          System.out.println(beerNum + " " + word + " of beer on the wall");
        } else {
          System.out.println("No more bottles of beer on the wall");
        }  // else 结束
      }  // while 结束
    }  // main 方法结束
}  // class 结束
