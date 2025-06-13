public class ObjectComparison
{
    int field1;
    int field2;
    int field3;

    ObjectComparison()
    {
        field1 = 0;
        field2 = 0;
        field3 = 0;
    }

    ObjectComparison(int field1, int field2)
    {
        this.field1 = field1;
        this.field2 = field2;
    }

    ObjectComparison(int field1, int field2, int field3)
    {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    static boolean compareObjects(ObjectComparison obj1, ObjectComparison obj2)
    {
        return obj1.equals(obj2); // Will print true if obj1 and obj2 share same memory location
    }

    public static void main(String[] args)
    {
        ObjectComparison obj1 = new ObjectComparison();
        ObjectComparison obj2 = new ObjectComparison();
        ObjectComparison obj3 = new ObjectComparison(1, 2);
        ObjectComparison obj4 = new ObjectComparison(2, 3);
        ObjectComparison obj5 = new ObjectComparison(1, 2);
        ObjectComparison obj6 = new ObjectComparison(1, 2);

        System.out.println("obj1 and obj2 : " + compareObjects(obj1, obj2));
        System.out.println("obj1 and obj3 : " + compareObjects(obj1, obj3));
        System.out.println("obj1 and obj4 : " + compareObjects(obj1, obj4));
        System.out.println("obj1 and obj5 : " + compareObjects(obj1, obj5));
        System.out.println("obj1 and obj6 : " + compareObjects(obj1, obj6));
        System.out.println("obj3 and obj5 : " + compareObjects(obj3, obj5));
        System.out.println("obj3 and obj6 : " + compareObjects(obj3, obj6));

    }
}
