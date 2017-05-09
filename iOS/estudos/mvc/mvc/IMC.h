//
//  IMC.h
//  mvc
//
//  Created by Lucas Rocha on 09/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Person.h"

@interface IMC : NSObject

+ (double) getImcValueOf: (Person*) person;
+ (NSString*) getImcSituationOf: (Person*) person;

@end
