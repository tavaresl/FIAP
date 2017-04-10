//
//  Person.m
//  mvc
//
//  Created by Lucas Rocha on 09/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "Person.h"

@implementation Person

- (Person*) initWithName: (NSString*) name
               andHeight: (double) height
               andWeight: (double) weight {
    
    self = [super init];
    
    if (self) {
        self.name = name;
        self.height = height;
        self.weight = weight;
    }
    
    return self;
}

@end
