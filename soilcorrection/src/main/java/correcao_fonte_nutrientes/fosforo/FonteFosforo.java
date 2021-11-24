package correcao_fonte_nutrientes.fosforo;

import correcao_fonte_nutrientes.IFonteNutriente;
import correcao_fonte_nutrientes.NomeNutrienteAdicional;
import correcao_fonte_nutrientes.NutrienteAdicional;
import java.util.Set;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FonteFosforo 
        implements IFonteNutriente {

    SUPERFOSFATO_SIMPLES(
        0.18, 
        Set.of(
            new NutrienteAdicional(
                NomeNutrienteAdicional.ENXOFRE, 0.1), 
                new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.28))),
    SUPERFOSFATO_TRIPO(
        0.41, 
        Set.of(
            new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.2))),
    MAP(
        0.48, 
        Set.of(
            new NutrienteAdicional(NomeNutrienteAdicional.NITROGENIO, 0.09)));

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;

}
