import  java.util.*;
import java.util.Scanner;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser {

    // Implementação dos métodos das interfaces

    @Override
    public void playMusic() {
        // Implementação específica para reproduzir música no iPhone
    }

    @Override
    public void pauseMusic() {
        // Implementação específica para pausar a música no iPhone
    }

    @Override
    public void skipTrack() {
        // Implementação específica para pular faixas de música no iPhone
    }

    @Override
    public void makeCall(String number) {
        // Implementação específica para realizar chamadas no iPhone
    }

    @Override
    public void receiveCall() {
        // Implementação específica para receber chamadas no iPhone
    }

    @Override
    public void openURL(String url) {
        // Implementação específica para abrir URLs no navegador do iPhone
    }

    @Override
    public void closeURL() {
        // Implementação específica para fechar a página atual no navegador do iPhone
    }
}

}
