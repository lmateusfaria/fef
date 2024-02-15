unit untExercito;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ZAbstractConnection, ZConnection;

type
  TForm1 = class(TForm)
    conexao: TZConnection;
    procedure FormShow(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.FormShow(Sender: TObject);
var queryCarregarBanco : TZQuery;

begin
  try
    conexao.HostName := 'localhost';
    conexao.User := 'postgres';
    conexao.Port := 5432;
    conexao.Database := 'exercicio_bd_01';
    conexao.Password := 'postdba';
    conexao.LibraryLocation := 'C:\Program Files (x86)\pgAdmin III\1.22\libpq11.dll';
    conexao.Protocol := 'postgresql-9';
    conexao.Connect;
    with queryCarregarBanco do
      begin

      end;

  except
    on e: Exception do
      begin
        ShowMessage('Erro: '+ e.Message);
      end;
end;

end.
