//
//  Pessoa.h
//  Exemplo_ObjC
//
//  Created by Lucas Rocha on 03/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Pessoa : NSObject

@property (nonatomic, retain) NSString *nome;
@property (nonatomic) float peso;
@property (nonatomic) float altura;
@property (nonatomic) float imc;

- (float) calcularIMC;

@end
