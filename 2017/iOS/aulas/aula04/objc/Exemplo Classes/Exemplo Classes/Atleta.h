//
//  Atleta.h
//  Exemplo Classes
//
//  Created by Lucas Rocha on 06/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Atleta : NSObject {
    NSString *nome;
    int idade;
}

- (void) setNome : (NSString *)_nome;
- (NSString *) getNome;
- (void) setIdade : (int) _idade;
- (int) getIdade;

- (void) calcularImcComPeso : (float) peso eAltura : (float) altura;
- (NSString *) calcularRendimentoNaAguaWithTempo : (float) horas
                                      eDistancia : (float) metros;

@end
