//
//  ViewController.m
//  mvc
//
//  Created by Lucas Rocha on 09/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import "ViewController.h"
#import "IMC.h"
#import "Person.h"

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


- (IBAction)calcImc:(id)sender {
    NSString* name = self.txtFullName.text;
    double height = [self.txtHeight.text doubleValue];
    double weight = [self.txtWeight.text doubleValue];
    
    Person* person = [[Person alloc] initWithName:name andHeight:height andWeight:weight];
    
    double imcValue = [IMC getImcValueOf:person];
    NSString* imcSituation = [IMC getImcSituationOf:person];
    
    self.lblImcValue.text = [NSString stringWithFormat:@"%.2f", imcValue];
    self.lblImcSituation.text = imcSituation;
    
    [self.view endEditing:YES];
}

@end
