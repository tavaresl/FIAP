//
//  Enfermeira.m
//  Exercicio_Enfermeira_POO
//
//  Created by Lucas Rocha on 13/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "Enfermeira.h"

@implementation Enfermeira

- (void) setNome : (NSString*) _nome {
    nome = _nome;
}
- (NSString *) getNome {
    return nome;
}

- (void) setCadastroAtivo : (BOOL) _ativo {
    cadastroAtivo = _ativo;
}
- (BOOL) isCadastroAtivo {
    return cadastroAtivo;
}

- (void) setDependentes : (int) _dependentes {
    dependentes = _dependentes;
}
- (int) getDependentes {
    return dependentes;
}

- (void) setAltura : (float) _altura {
    altura = _altura;
}
- (float) getAltura {
    return altura;
}

- (Enfermeira *) initComNome : (NSString *) _nome
              eCadastroAtivo : (BOOL) _cadastroAtivo
                eDependentes : (int) _dependentes
                     eAltura : (float) _altura {
    self = [super init];
    
    if (self) {
        [self setNome: _nome];
        [self setDependentes: _dependentes];
        [self setCadastroAtivo: _cadastroAtivo];
        [self setAltura: _altura];
    }
    
    return self;
}


- (float) calcularIMCParaPeso : (float) peso {
    return peso / (altura * altura);
}
- (NSString *) getNomeComTitulo : (NSString*) titulo {
    return [titulo stringByAppendingString: nome];
}
@end
