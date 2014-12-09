package com.gustavoholanda.organizadorpessoal;

public class Manga {

    private String descricao;
    private String  tipoManga;
    private Boolean ehOneShot;
    private Boolean ehManga;
    private Boolean ehManhwa;
    private Boolean ehManhua;
    private String ultimoCapitulo;    
    private String statusNoPaisDeOrigem;
    private int scoreMangaUpdates;
    private int scoreMyAnimeList;  //Dado do site http://myanimelist.net/
    private int anoDeLancamento;
    private String autor; //OBS: DEPOIS FAZER PRA AGUENTAR MAIS AUTORES
    //OBS:  Colocar Variavel para armazenar a imagem!!
    private int nota;
    
    
    //Métodos Setters e getters
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void ehOneShot(){   //O mangá é OneShot.  
        this.ehOneShot=true;
    }
    public void ehManga(){     //O tipo de mangá é Manga.
        this.ehManga=true;
    }
    public void ehManhwa(){    //O tipo de mangá é Manhwa.
        this.ehManhwa=true;
    }
    public void ehManhua(){    //O tipo de mangá é Manhua.
        this.ehManhua=true;
    }
    public String getstatusNoPaisDeOrigem(){
        return this.statusNoPaisDeOrigem;
    }
    public void setultimoCapitulo(String ultimoCapitulo){
        this.ultimoCapitulo = ultimoCapitulo;
    }
    public String getultimoCapitulo(){
        return this.ultimoCapitulo;
    }
    public void statusNoPaisDeOrigem_finalizado(){  // Status no país de origem é de Finalizado.
        this.statusNoPaisDeOrigem = "Concluído";
    }
    public void statusNoPaisDeOrigem_emLancamento(String Volume){ // Status no país de origem é de em Lançamento.
        this.statusNoPaisDeOrigem = "Em Lançamento." + "Volume: " +Volume;
    }
     public void setscoreMangaUpdates(int scoreMangaUpdates){
        this.scoreMangaUpdates = scoreMangaUpdates;
    }
    public int getscoreMangaUpdates(){
        return this.scoreMangaUpdates;
    }
    public void setscoreMyAnimeList(int scoreMyAnimeList){ 
        this.scoreMyAnimeList = scoreMyAnimeList;
    }
    public int getscoreMyAnimeList(){
        return this.scoreMyAnimeList;
    }
    public void setanoDeLancamento(int anoDeLancamento){ 
        this.anoDeLancamento = anoDeLancamento;
    }
    public int getanoDeLancamento(){
        return this.anoDeLancamento;
    }
    public String getAutor (){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getNota(){
        return this.nota;
    }
    public void setNota(int nota){ 
        this.nota = nota;
    }
}
