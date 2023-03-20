package mercado;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
	private Map<Integer,Produto> produtos;
	
	public ProdutoRepository() {
		this.produtos = new HashMap<Integer,Produto>();
	}
	private void addProduto(int i, Produto prod) {
		if(i <= 0) {
			throw new IllegalArgumentException("id inválido");
		}
		this.produtos.put(i, prod);
	}
}
