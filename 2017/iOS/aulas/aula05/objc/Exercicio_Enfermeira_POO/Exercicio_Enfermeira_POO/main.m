//
//  main.m
//  Exercicio_Enfermeira_POO
//
//  Created by Lucas Rocha on 13/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Enfermeira.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        // insert code here...
        NSLog(@"Hello, World!");
        
        Enfermeira *enfermeira = [[Enfermeira alloc] init];
        
        [enfermeira setNome: @"Nathália"];
        [enfermeira setAltura: 1.58];
        [enfermeira setDependentes: 0];
        [enfermeira setCadastroAtivo: YES];
        
        if ([enfermeira isCadastroAtivo]) {
            NSLog(@"%@ tem %0.2f de altura e %d dependentes", [enfermeira getNome], [enfermeira getAltura], [enfermeira getDependentes]);
        }
        
        Enfermeira *edileine = [[Enfermeira alloc] initComNome:@"Edileine" eCadastroAtivo:YES eDependentes:4 eAltura:1.61];
        
        
        NSString *nomeComTitulo = [edileine getNomeComTitulo:@"Sra. "];
        float imc = [edileine calcularIMCParaPeso: 68.3];
        
        NSLog(@"%@", nomeComTitulo);
        NSLog(@"O IMC de %@ é %0.2f", [edileine getNome], imc);
    }
    return 0;
}
