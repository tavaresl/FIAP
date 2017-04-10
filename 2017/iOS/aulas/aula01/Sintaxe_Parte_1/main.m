//
//  main.m
//  Sintaxe_Parte_1
//
//  Created by Lucas Rocha on 01/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        // insert code here...
        
        unsigned int totdias;
        unsigned int idade;
        const int valor = 1e9;
        
        NSString *nome = @"Tavares";
        idade = 19;
        NSLog(@"O prêmio acumulado é de %d", valor);
        
        totdias = idade * 365;
        
        NSLog(@"Dias vividos até hoje: %d.", totdias);
        
    }
    return 0;
}
