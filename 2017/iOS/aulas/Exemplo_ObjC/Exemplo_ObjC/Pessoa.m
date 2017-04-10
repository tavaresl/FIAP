//
//  Pessoa.m
//  Exemplo_ObjC
//
//  Created by Lucas Rocha on 03/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "Pessoa.h"

@implementation Pessoa

- (float) calcularIMC {
    return self.peso / pow(self.altura, self.altura);
}

@end
