//
//  Enfermeira.h
//  Exercicio_Enfermeira_POO
//
//  Created by Lucas Rocha on 13/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Enfermeira : NSObject {
    NSString *nome;
    BOOL cadastroAtivo;
    int dependentes;
    float altura;
}

- (void) setNome : (NSString*) _nome;
- (NSString *) getNome;

- (void) setCadastroAtivo : (BOOL) _ativo;
- (BOOL) isCadastroAtivo;

- (void) setDependentes : (int) _dependentes;
- (int) getDependentes;

- (void) setAltura : (float) _altura;
- (float) getAltura;

- (Enfermeira *) initComNome : (NSString *) _nome
                        eCadastroAtivo : (BOOL) _cadastroAtivo
                        eDependentes : (int) _dependentes
                        eAltura : (float) _altura;

- (float) calcularIMCParaPeso : (float) peso;
- (NSString *) getNomeComTitulo : (NSString *) titulo;

@end
