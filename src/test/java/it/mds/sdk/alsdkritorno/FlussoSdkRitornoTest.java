package it.mds.sdk.alsdkritorno;

import it.mds.sdk.aljavalib.exception.AccessLayerException;
import it.mds.sdk.aljavalib.module.FlussoRequestSdkRitorno;
import it.mds.sdk.aljavalib.service.FlussoService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

@Disabled
public class FlussoSdkRitornoTest {

    private FlussoSdkRitorno flusso = new FlussoSdkRitorno(FlussoService.getInstanceDefaultHttpClient("http" +
            "://localhost:8080", "sdkritorno"));

    @Test
    public void eseguiFlussoIntegration() throws AccessLayerException {
        FlussoRequestSdkRitorno flussoRequest = new FlussoRequestSdkRitorno();
        flussoRequest.setIdsUpload(List.of("1","2","3"));
        flussoRequest.setNomeFlusso("nome_flusso_test");
        flussoRequest.setIdClient("123456");
        flusso.getStatoElaborazioniSdkRitorno(flussoRequest);
    }

    @Test
    public void infoRunIntegration() throws AccessLayerException {
    }
}
