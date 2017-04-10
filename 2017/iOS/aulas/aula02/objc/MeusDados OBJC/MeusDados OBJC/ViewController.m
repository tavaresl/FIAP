//
//  ViewController.m
//  MeusDados OBJC
//
//  Created by Lucas Rocha on 01/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    // Insere os textos iniciais nas labels
    meuLabel1.text = @"Meu nome é ...";
    meuLabel2.text = @"Minha idade é ...";
    meuLabel3.text = @"Minha cidade é ...";
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


- (IBAction)exibir:(id)sender {
    
    // Substitui o valor das Labels quando o botão "Exibir" é pressionado.
    meuLabel1.text = @"Lucas Tavares";
    meuLabel2.text = @"19 anos";
    meuLabel3.text = @"São Paulo";
}

- (IBAction)limpar:(id)sender {
    
    // Limpa o valor das Labels quando o botão "Limpar" é pressionado.
    meuLabel1.text = @"";
    meuLabel2.text = @"";
    meuLabel3.text = @"";
}
@end
