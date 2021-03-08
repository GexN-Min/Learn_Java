// 3、【编号：211】 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。
// 假定，父母和子女的身高遗传关系如下：​ 
// 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2​ 
// 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2 
// 现有父亲身高177CM,母亲身高165CM。
// 求子女身高分别预计为多少？

public class Demo03 {
    public static void main(String[] args) {
      
        final int FATHER_HEIGHT = 177;
        final int MOTHER_HEIGHT = 165;

        double sonHeight = (FATHER_HEIGHT + MOTHER_HEIGHT) * 1.08 / 2;
        double girlHeight = (FATHER_HEIGHT * 0.923 + MOTHER_HEIGHT) / 2;

        System.out.println(sonHeight);
        System.out.println(girlHeight);

    }
}
