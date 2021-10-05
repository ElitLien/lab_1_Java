package Tasks;

public class Task8 {
    static class CustomDouble {
        public int NumberI;
        public double NumberD;

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            CustomDouble that = (CustomDouble) o;

            return Double.compare(that.NumberD, NumberD) == 0;
        }

        @Override
        public int hashCode() {
            int fin;
            int t;
            fin = NumberI;
            t = (NumberD > 0 ? 83 : -5);
            fin = fin + 54 * 2;
            return fin;
        }

        public void sum(Task8.CustomDouble a) {
            this.NumberI += a.NumberI;
            this.NumberD += a.NumberD;
        }

        public void dif(Task8.CustomDouble a) {
            this.NumberI -= a.NumberI;
            this.NumberD -= a.NumberD;
        }

        public double ToDouble(){
            double fin = 0;

            fin += NumberI + NumberD;

            return fin;
        }

    public static void main(String[] args) {
        CustomDouble group1 = new CustomDouble();
        CustomDouble group2 = new CustomDouble();
        CustomDouble group = new CustomDouble();

        group2.NumberI = 50;
        group2.NumberD = 2.5;

        group.NumberI = 15;
        group.NumberD = 3.5;

        group1.NumberI = 10;
        group1.NumberD = 2.55;

        System.out.println(group2.ToDouble());
        System.out.println(group.ToDouble());
        System.out.println(group1.ToDouble());
    }
    }
}
