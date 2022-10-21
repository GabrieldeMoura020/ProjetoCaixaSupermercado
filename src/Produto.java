import java.math.BigDecimal;

public class Produto {

    private Integer idProduto;
    private String descricao;
    private Integer codigoBarras;
    private BigDecimal valor;
    private String tipoProduto;
    private String marcaProduto;
    private Integer cfop;
    private Integer cst;
    private Integer ncm;
    private Integer icms;
    private String unidade;

    private Categoria categoria;

    private Desconto desconto;

    public Produto(Integer idProduto, String descricao, Integer codigoBarras, BigDecimal valor, String tipoProduto
    , String marcaProduto, Integer cfop, Integer cst, Integer ncm, Integer icms, String unidade, Categoria categoria,
                   Desconto desconto) {

        this.idProduto = idProduto;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
        this.tipoProduto = tipoProduto;
        this.marcaProduto = marcaProduto;
        this.cfop = cfop;
        this.cst = cst;
        this.ncm = ncm;
        this.icms = icms;
        this.unidade = unidade;
        this.categoria = categoria;
        this.desconto = desconto;
    }


    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Integer getCst() {
        return cst;
    }

    public void setCst(Integer cst) {
        this.cst = cst;
    }

    public Integer getNcm() {
        return ncm;
    }

    public void setNcm(Integer ncm) {
        this.ncm = ncm;
    }

    public Integer getIcms() {
        return icms;
    }

    public void setIcms(Integer icms) {
        this.icms = icms;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Integer codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public Categoria getCategoria() {return categoria;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public Desconto getDesconto() {return desconto;}

    public void setDesconto(Desconto desconto) {this.desconto = desconto;}


    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", descricao='" + descricao + '\'' +
                ", codigoBarras=" + codigoBarras +
                ", valor=" + valor +
                ", tipoProduto='" + tipoProduto + '\'' +
                ", marcaProduto='" + marcaProduto + '\'' +
                ", cfop=" + cfop +
                ", cst=" + cst +
                ", ncm=" + ncm +
                ", icms=" + icms +
                ", unidade='" + unidade + '\'' +
                ", categoria=" + categoria +
                ", desconto=" + desconto +
                '}';
    }
}
