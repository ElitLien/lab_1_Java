package Tasks;

public class Task9 {
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

        public void sum(CustomDouble a) {
            this.NumberI += a.NumberI;
            this.NumberD += a.NumberD;
        }

        public void dif(CustomDouble a) {
            this.NumberI -= a.NumberI;
            this.NumberD -= a.NumberD;
        }

        public double ToDouble(){
            double fin = 0;

            fin += NumberI + NumberD;

            return fin;
        }

        public double multi(CustomDouble a){
            return this.ToDouble() * a.ToDouble();
        }

        public double division(CustomDouble a){
            return this.ToDouble() / a.ToDouble();
        }
    }

        public static void main(String[] args) {
            CustomDouble group1 = new CustomDouble();
            CustomDouble group2 = new CustomDouble();

            group1.NumberI = 5;
            group1.NumberD = 1.5;

            group2.NumberI = 20;
            group2.NumberD = 0.5;

            System.out.println(group1.ToDouble());
            System.out.println(group2.ToDouble());

            group1.NumberI = 4;
            group1.NumberD = 2.5;

            group2.NumberI = 50;
            group2.NumberD = 0.25;

            System.out.println(group1.multi(group2));

            group1.NumberI = 50;
            group1.NumberD = 0.5;

            group2.NumberI = 10;
            group2.NumberD = 0.25;

            System.out.println(group1.division(group2));
        }
}
