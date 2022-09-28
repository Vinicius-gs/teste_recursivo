package Ex_recursao;

public class teste_recursao {
	
	public teste_recursao() {
		
	}
	
	public int somaRecursiva(int n) {
        if (n == 0)
            return 0;
        else
            return n + somaRecursiva(n - 1);

	}

}
