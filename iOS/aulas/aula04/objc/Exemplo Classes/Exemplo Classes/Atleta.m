//
//  Atleta.m
//  Exemplo Classes
//
//  Created by Lucas Rocha on 06/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "Atleta.h"

@implementation Atleta

- (void) setNome : (NSString *)_nome {
    nome = _nome;
}

- (NSString *) getNome {
    return nome;
}

- (void) setIdade : (int) _idade {
    idade = _idade;
}

- (int) getIdade {
    return idade;
}

// (returnType) methodNameWithParam1 : (param1Type) param1 andParam2 : (param2Type) param2
- (void) calcularImcComPeso : (float) peso eAltura : (float) altura {
    float imc;
    
    imc = peso / (altura * altura);
    
    NSLog(@"O IMC de %@ é %0.2f", [self getNome], imc);
}

- (NSString *) calcularRendimentoNaAguaWithTempo : (float) horas
                                      eDistancia : (float) metros {
    float resultado = 0.0;
    
    if (horas > 0.0) {
        resultado = metros / horas;
    }
    else {
        resultado = metros / 1.0;
    }
    
    return [NSString stringWithFormat:@"Meu rendimento é %0.2f metros por hora", resultado];
}
@end
