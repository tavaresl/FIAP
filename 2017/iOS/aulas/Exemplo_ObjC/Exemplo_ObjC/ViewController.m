//
//  ViewController.m
//  Exemplo_ObjC
//
//  Created by Lucas Rocha on 03/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)calcular:(id)sender {
    Pessoa *pessoa = [[Pessoa alloc]init];
    
    pessoa.peso   = self.inputPeso.text.floatValue;
    pessoa.altura = self.inputAltura.text.floatValue;
    pessoa.nome   = self.inputAtleta.text;
    
    pessoa.imc = pessoa.calcularIMC;
    
    self.inputIMC.text = [NSString stringWithFormat:@"%.2f", pessoa.imc];
}
@end
