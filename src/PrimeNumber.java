public class PrimeNumber {
    public boolean primeNumber(int value)
    {
        int count = 0;

            for(int i = 1; i<=value; i++)
            {
                if(value%i == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
}
