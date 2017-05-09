//
//  ViewController.h
//  MeusDados OBJC
//
//  Created by Lucas Rocha on 01/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController {
    __weak IBOutlet UILabel *meuLabel1;
    __weak IBOutlet UILabel *meuLabel2;
    IBOutlet UILabel *meuLabel3;
}

- (IBAction)exibir:(id)sender;

- (IBAction)limpar:(id)sender;

@end

