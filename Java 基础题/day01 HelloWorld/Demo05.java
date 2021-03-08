public class Demo05 {
    public static void main(String[] args) {
//       5、【编号：105】 请根据下列描述，选用合适的数据类型定义变量来描述其中的数据，并输出变量的值。 
//       1、班级里有100个学员。 
//       2、某商品价格55.55元。 
//       3、地球已经诞生超过46亿年。 
//       4、“5是偶数”这句话的描述是假的。 
//       输出结果如下：
// 100
// 55.55
// 4600000000
// false
        int stu = 100;
        float price = 55.55f;
        long earthAge = 4600000000L;
        boolean isEven = false;

        System.out.println(stu);
        System.out.println(price);
        System.out.println(earthAge);
        System.out.println(isEven);
    }
}
