interface Language{
   void getClienLanguage(String clientLanguage);
}
class Languages implements Language {
   public void getClienLanguage(String clientLanguage){
        System.out.println("Client would like to speak in language " + clientLanguage);
   }

}