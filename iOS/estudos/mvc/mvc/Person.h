//
//  Person.h
//  mvc
//
//  Created by Lucas Rocha on 09/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Person : NSObject

@property (nonatomic, retain) NSString *name;
@property (nonatomic) double weight;
@property (nonatomic) double height;

- (Person*) initWithName: (NSString*) _name
               andHeight: (double) _height
               andWeight: (double) _weight;

@end
