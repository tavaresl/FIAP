//
//  main.m
//  Exemplo Classes
//
//  Created by Lucas Rocha on 06/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Atleta.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Atleta *a = [[Atleta alloc]init];
        [a setNome: @"Maria Silva"];
        [a setIdade: 25];
        NSLog(@"Iron man %@ %d anos", [a getNome], [a getIdade]);
        [a calcularImcComPeso:63.4 eAltura:1.67];
        NSString *rendimentoEmAgua = [a calcularRendimentoNaAguaWithTempo:15.5 eDistancia:197.3];
        NSLog(rendimentoEmAgua);
    }
    return 0;
}
