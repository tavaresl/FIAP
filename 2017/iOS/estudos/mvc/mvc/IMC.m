//
//  IMC.m
//  mvc
//
//  Created by Lucas Rocha on 09/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "IMC.h"

@implementation IMC

+ (double) getImcValueOf: (Person*) person {
    return person.weight / (pow(person.height, 2));
}

+ (NSString*) getImcSituationOf: (Person*) person {
    double imc = [IMC getImcValueOf:person];
    
    if (imc < 16) {
        return @"Magreza grave";
    }
    else if (imc < 17) {
        return @"Magreza moderada";
    }
    else if (imc < 18.5) {
        return @"Magreza leve";
    }
    else if (imc < 25) {
        return @"Saudável";
    }
    else if (imc < 30) {
        return @"Sobrepeso";
    }
    else if (imc < 35) {
        return @"Obesidade grau I";
    }
    else if (imc < 40) {
        return @"Obesidade grau II";
    }
    
    return @"Obesidade grau III";
}

@end
