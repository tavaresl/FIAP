//
//  ViewController.h
//  Exemplo_ObjC
//
//  Created by Lucas Rocha on 03/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Pessoa.h"

@interface ViewController : UIViewController
    @property (weak, nonatomic) IBOutlet UITextField *inputAtleta;
    @property (weak, nonatomic) IBOutlet UITextField *inputPeso;
    @property (weak, nonatomic) IBOutlet UITextField *inputAltura;
    @property (weak, nonatomic) IBOutlet UITextField *inputIMC;

- (IBAction)calcular:(id)sender;

@end
