//
//  ViewController.h
//  mvc
//
//  Created by Lucas Rocha on 09/04/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController

@property (weak, nonatomic) IBOutlet UITextField *txtFullName;
@property (weak, nonatomic) IBOutlet UITextField *txtWeight;
@property (weak, nonatomic) IBOutlet UITextField *txtHeight;
@property (weak, nonatomic) IBOutlet UILabel *lblImcValue;
@property (weak, nonatomic) IBOutlet UILabel *lblImcSituation;

- (IBAction)calcImc:(id)sender;

@end

